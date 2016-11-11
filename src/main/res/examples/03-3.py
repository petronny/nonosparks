import json
example='03-3'
data={}
data['width']=5
data['height']=1
data['answer']=[]
data['answer'].append([0,1,1,1,1])
json.dump(data,open('examples/'+example+'.json','w'),sort_keys=True)
