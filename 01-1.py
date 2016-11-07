import json
example='01-1'
data={}
data['width']=5
data['height']=1
data['hints']={}
data['hints']['vertical']=['1 1 1']
data['answer']=[]
data['answer'].append([1,0,1,0,1])
json.dump(data,open('examples/'+example+'.json','w'),sort_keys=True)
